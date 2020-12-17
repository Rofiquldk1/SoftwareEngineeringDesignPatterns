
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subscriber sb = new Subscriber("Rofiqul");
		Subscriber sb2 = new Subscriber("Rofiqul Islam");
		Subscriber sb3 = new Subscriber("Md Rofiqul Islam");
		
		Channel ch = new Channel();
		ch.subscribe(sb);
		ch.subscribe(sb2);
		ch.subscribe(sb3);
		
		
		sb.setCh(ch);		
		sb2.setCh(ch);
		sb3.setCh(ch);


		ch.upload("Alif layla");

	}

}
