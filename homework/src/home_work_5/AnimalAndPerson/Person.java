package home_work_5.AnimalAndPerson;

//1.1. Написать класс Person который содержит поля:
//		1.1.1. Строку nick - псевдоним пользователя
//		1.1.2. Строку password - пароль (от 5 до 10 символов)
//		1.1.3. Строку name - имя пользователя

public class Person {
       private  String nick;
       private String password;
       private String name;

       public Person(String nick,String password,String name){
               this.nick = nick;
               this.password = password;
               this.name = name;
       }



        public String getNick() {
                return nick;
        }

        public String getPassword() {
                return password;
        }

        public String getName() {
                return name;
        }
}
