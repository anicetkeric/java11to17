package com.example.java17feature;



public class SealedFeature {

    sealed class Person permits Man, Woman, Child {}


    // la classe Person ne peut être herité que par les classes Man, Woman et Child.
  /*  sealed class Person permits Man, Woman, Child {
        public void die(){}
    }*/

    non-sealed class Man extends Person {

    }

    final class Woman extends Person {}

    sealed class Child extends Person permits Boy, Girl {}
    final class Boy extends Child {}
    final class Girl extends Child {}

    class Superman extends Man {}

    //n'est pas autorisé dans la hiérarchie scellée
//     final class Sun extends Person {};
//    class Cat extends Person {}

}
