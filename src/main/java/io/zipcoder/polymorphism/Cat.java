package io.zipcoder.polymorphism;

public class Cat extends Pet {
        private   String name;
        private String speak;

        public Cat(String speak, String name){
            super(speak,name);
        }

        public String speak(){

            return "meow!";
        }

}
