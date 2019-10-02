package person;

public class Test {

	public static void main(String[]args){

	Person taro=new Person();
	taro.name="山田太郎";
	taro.age=20;
	taro.phoneNumber="000-0000-0000";
	taro.address="東京";


	Person jiro=new Person();
	jiro.name="木村次郎";
	jiro.age=18;
	jiro.phoneNumber="000-0000-0000";
	jiro.address="����";

	Person hanako=new Person();
	hanako.name="鈴木花子";
	hanako.age=16;
	hanako.phoneNumber="000-0000-0000";
	hanako.address="����";

	Person yuki=new Person();
	yuki.name="佐藤優樹";
	yuki.age=27;
	yuki.phoneNumber="000-0000-0000";
	yuki.address="����";


	Person aiko=new Person();
	aiko.name="aiko";


	Person asimo=new Person();
	asimo.name="asimo";




	Person pepper=new Person();
	pepper.name="pepper";





	System.out.println(taro.name);
	System.out.println(taro.age);
	System.out.println(taro.phoneNumber);
	System.out.println(taro.address);
	System.out.println(jiro.name);
	System.out.println(jiro.age);
	System.out.println(jiro.phoneNumber);
	System.out.println(jiro.address);
	System.out.println(hanako.name);
	System.out.println(hanako.age);
	System.out.println(hanako.phoneNumber);
	System.out.println(hanako.address);
	System.out.println(yuki.name);
	System.out.println(yuki.age);
	System.out.println(yuki.phoneNumber);
	System.out.println(yuki.address);


	taro.talk();
	taro.walk();
	taro.run();
	jiro.talk();
	jiro.walk();
	jiro.run();
	hanako.talk();
	hanako.walk();
	hanako.run();
	yuki.talk();
	yuki.walk();
	yuki.run();

	aiko.talk();
	aiko.walk();
	aiko.run();

	asimo.talk();
	asimo.walk();
	asimo.run();

	pepper.talk();
	pepper.walk();
	pepper.run();


	}

}
