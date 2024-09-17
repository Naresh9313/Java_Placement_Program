//genercisexamples
//"<>"

package genericsexamples;

public class Sender  <T,K>{
	
	private  T data;
	private K data1;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	

	public K getData1() {
		return data1;
	}

	public void setData1(K data1) {
		this.data1 = data1;
	}

	@Override
	public String toString() {
		return "Sender [data=" + data + ", data1=" + data1 + "]";
	}
	


}
