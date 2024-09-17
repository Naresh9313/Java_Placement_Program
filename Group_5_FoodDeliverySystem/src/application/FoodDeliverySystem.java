//Package declaration for the application
package application;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

//Importing entities package for models like Restaurant, FoodItem, etc.
import entities.*;

//Importing services package for handling business logic
import services.*;

public class FoodDeliverySystem {

	// Initializing services for food, customer, and order management
	private static final FoodService foodService = new FoodService();
	private static final CustomerService customerService = new CustomerService();
	private static final OrderService orderService = new OrderService();
	
	// Counters for generating unique IDs for various entities like restaurant, food item, etc.
	private static int restaurantIdCounter = 1, foodItemIdCounter = 1, customerIdCounter = 1, orderIdCounter = 1, deliveryPersonIdCounter = 1;

	// Main entry point of the program
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Menu loop allowing the user to select either admin, customer panel, or exit
		while (true) {
			System.out.println("1. Admin Panel\n2. Customer Panel\n3. Exit \n4.choose option:");
			
			// Switch case to handle panel selection
			switch (scanner.nextInt()) {
				case 1: adminMenu(scanner); break; // Admin panel
				case 2: customerMenu(scanner); break; // Customer panel
				case 3: System.out.println("Exit..."); break;
				case 4: System.out.print("Choose otion");
				scanner.close(); return; // Exit the program
				default: System.out.println("Invalid choice!"); // Handle invalid input
			}
		}
	}

	// Admin menu with different management options
	private static void adminMenu(Scanner scanner) {
		int choice;
		do {
			// Display admin menu options
			System.out.println("\nAdmin Menu:\n1. Add Rest\n2. Add Food \n3. Remove Food \n4. View Rest\n5. "
					+ "View Orders\n6. Add Delivery Person\n7. Assign Delivery Person\n8. Exit\n9.choose option:");
			
			// Switch case for each admin function
			switch (choice = scanner.nextInt()) {
				case 1: addRestaurant(scanner); break; // Add restaurant
				case 2: addFoodItemToRestaurant(scanner); break; // Add food item to restaurant
				case 3: removeFoodItemFromRestaurant(scanner); break; // Remove food item from restaurant
				case 4: viewRestaurantAndMenus(); break; // View all restaurants and their menus
				case 5: viewOrders(); break; // View all orders
				case 6: addDeliveryPerson(scanner); break; // Add a delivery person
				case 7: assignDeliveryPersonToOrder(scanner); break; // Assign a delivery person to an order
				case 8: System.out.println("Exiting Admin..."); break; // Exit admin panel
				default: System.out.println("Invalid choice!"); // Handle invalid input
			}
		} while (choice != 8); // Loop until the admin chooses to exit
	}

	// Customer menu with options related to order placement, cart, etc.
	private static void customerMenu(Scanner scanner) {
		int choice;
		do {
			// Display customer menu options
			System.out.println("\nCustomer Menu:\n1. Add Customer\n2. View Food Items\n3. Add to Cart\n4. "
					+ "View Cart\n5. Place Order\n6. View Orders\n7. Exit \n8.choose option:");
			
			// Switch case for each customer function
			switch (choice = scanner.nextInt()) {
				case 1: addCustomer(scanner); break; // Add a new customer
				case 2: viewFoodItems(); break; // View available food items
				case 3: addFoodToCart(scanner); break; // Add food to the cart
				case 4: viewCart(scanner); break; // View customer's cart
				case 5: placeOrder(scanner); break; // Place an order
				case 6: viewOrders(); break; // View all customer orders
				case 7: System.out.println("Exiting Customer Menu..."); break; // Exit customer panel
				default: System.out.println("Invalid choice!"); // Handle invalid input
			}
		} while (choice != 7); // Loop until the customer chooses to exit
	}

	// Admin: Add a restaurant
	private static void addRestaurant(Scanner scanner) {
		System.out.print("Enter Restaurant Name: ");
		// Create a new restaurant with a unique ID
		foodService.addRestaurant(new Restaurant(restaurantIdCounter++, scanner.next()));
		System.out.println("Restaurant added!"); // Confirmation message
	}

	// Admin: Add a food item to a restaurant
	private static void addFoodItemToRestaurant(Scanner scanner) {
		System.out.print("Enter Restaurant ID, Food Item Name, Price: ");
		// Create a new food item and associate it with a restaurant
		foodService.addFoodItemToRestaurant(scanner.nextInt(), new FoodItem(foodItemIdCounter++, scanner.next(), scanner.nextDouble()));
		System.out.println("Food item added!"); // Confirmation message
	}

	// Admin: Remove a food item from a restaurant
	private static void removeFoodItemFromRestaurant(Scanner scanner) {
		System.out.print("Enter Restaurant ID, Food Item ID: ");
		// Remove the specified food item from the restaurant
		foodService.removeFoodItemFromRestaurant(scanner.nextInt(), scanner.nextInt());
		System.out.println("Food item removed!"); // Confirmation message
	}

	// Admin: View all restaurants and their menus
	private static void viewRestaurantAndMenus() {
		List<Restaurant> restaurants = foodService.getRestaurants(); // Retrieve all restaurants
		
		// Check if there are no restaurants
		if (restaurants.isEmpty()) System.out.println("No restaurants available.");
		else {
			// Iterate over each restaurant and display its menu
			for (Restaurant restaurant : restaurants) {
				System.out.println("Restaurant ID: " + restaurant.getId() + ", Name: " + restaurant.getName());
				restaurant.getMenu().forEach(item -> System.out.println("  Food ID: " + item.getId() + ", Name: " + item.getName() + ", Price: " + item.getPrice()));
			}
		}
	}

	// Admin: Add a delivery person
	private static void addDeliveryPerson(Scanner scanner) {
		System.out.print("Enter Delivery Person Name, Contact: ");
		// Create a new delivery person
		orderService.addDeliveryPerson(new DeliveryPerson(deliveryPersonIdCounter++, scanner.next(), scanner.nextLong()));
		System.out.println("Delivery person added!"); // Confirmation message
	}

	// Admin: Assign a delivery person to an order
	private static void assignDeliveryPersonToOrder(Scanner scanner) {
		System.out.print("Enter Order ID, Delivery Person ID: ");
		// Assign the delivery person to the specified order
		orderService.assignDeliveryPersonToOrder(scanner.nextInt(), scanner.nextInt());
		System.out.println("Delivery person assigned!"); // Confirmation message
	}

	// Customer: Add a new customer
	private static void addCustomer(Scanner scanner) {
		System.out.print("Enter Customer Name, Contact: ");
		// Create a new customer
		customerService.addCustomer(new Customer(customerIdCounter++, scanner.next(), scanner.nextLong()));
		System.out.println("Customer added!"); // Confirmation message
	}

	// Customer: View all available food items
	private static void viewFoodItems() {
		List<FoodItem> foodItems = foodService.getAllFoodItems(); // Retrieve all food items
		
		// Check if there are no food items
		if (foodItems.isEmpty()) System.out.println("No food items available.");
		else {
			// Display each food item
			foodItems.forEach(item -> System.out.println("Food ID: " + item.getId() + ", Name: " + item.getName() + ", Price: " + item.getPrice()));
		}
	}

	// Customer: Add a food item to the cart
	private static void addFoodToCart(Scanner scanner) {
		System.out.print("Enter Customer ID, Food Item ID, Quantity: ");
		Customer customer = customerService.getCustomer(scanner.nextInt()); // Find the customer by ID
		
		if (customer != null) {
			// Retrieve the food item from the list and add it to the cart
			FoodItem foodItem = foodService.getAllFoodItems().stream().filter(item -> item.getId() == scanner.nextInt()).findFirst().orElse(null);
			if (foodItem != null) customer.getCart().addItem(foodItem, scanner.nextInt());
			else System.out.println("Food item not found.");
		} else System.out.println("Customer not found.");
	}

	// Customer: View items in the cart
	private static void viewCart(Scanner scanner) {
		Customer customer = customerService.getCustomer(scanner.nextInt()); // Find the customer by ID
		
		if (customer != null) {
			Map<FoodItem, Integer> cartItems = customer.getCart().getItems(); // Retrieve cart items
			
			// Check if the cart is empty
			if (cartItems.isEmpty()) System.out.println("Cart is empty.");
			else {
				// Display each item in the cart
				cartItems.forEach((item, quantity) -> System.out.println("Food ID: " + item.getId() + ", Name: " + item.getName() + ", Quantity: " + quantity));
			}
		} else System.out.println("Customer not found.");
	}

	// Customer: Place an order
	private static void placeOrder(Scanner scanner) {
		 Customer customer = customerService.getCustomer(scanner.nextInt()); // Find the customer by ID
		
		 if (customer != null) {
			 // Create and place a new order, then clear the cart
			 orderService.placeOrder(new Order(orderIdCounter++, customer, customer.getCart().getItems()));
			 customer.getCart().clear();
			 System.out.println("Order placed!");
		 } else System.out.println("Customer not found.");
	}

	// View all orders (Admin & Customer)
	private static void viewOrders() {
		List<Order> orders = orderService.getOrders(); // Retrieve all orders
		
		// Check if there are no orders
		if (orders.isEmpty()) System.out.println("No orders available.");
		else {
			// Display each order and its details
			for (Order order : orders) {
				System.out.println("Order ID: " + order.getOrderId() + ", Customer: " + order.getCustomer().getUsername() + ", Status: " + order.getStatus());
				order.getItems().forEach((item, quantity) -> System.out.println("  Food ID: " + item.getId() + ", Name: " + item.getName() + ", Quantity: " + quantity));
				System.out.println(order.getDeliveryPerson() != null ? "Delivery Person: " + order.getDeliveryPerson().getName() : "No delivery person assigned.");
			}
		}
	}
}
