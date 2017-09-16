package design;

public class DesignPattern {
	public static void main(String[] ar){
		Developer kjg = new Developer.Builder("kjg", "M").setLanguage("C#").build();
		Developer iseul = new Developer.Builder("iseul", "F").setAge(26).setLanguage("Java & C#").build();
		Developer Limdo = new Developer.Builder("Limdo", "M").setAge(27).build();
		
		System.out.println(kjg.getName());
		System.out.println(iseul.getAge());
		System.out.println(iseul.getLanguage());
		System.out.println(Limdo.getGender());
	}
}

class Developer{
	private String name; 			// 필수
	private String gender;			// 필수
	private int age;			// 선택
	private String language;		// 선택
	
	public String getName(){
		return this.name;
	}
	
	public String getGender(){
		return this.gender;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public String getLanguage(){
		return this.language;
	}
	
	public static class Builder{
		private String name;
		private String gender;
		private int age = 0;
		private String language = null;
		
		public Builder(String name, String gender){
			this.name = name;
			this.gender = gender;
		}
		
		public Builder setAge(int age){
			this.age = age;
			return this;
		}
		
		public Builder setLanguage(String lang){
			this.language = lang;
			return this;
		}
		
		public Developer build(){
			Developer developer = new Developer();
			developer.name = name;
			developer.gender = gender;
			developer.age = age;
			developer.language = language;
			return developer;
		}
	}	
}
