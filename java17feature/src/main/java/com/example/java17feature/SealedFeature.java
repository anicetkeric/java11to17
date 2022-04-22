package com.example.java17feature;


/**
 * final: la sous-classe ne peut pas du tout être étendue
 * sealed: la sous-classe ne peut être étendue que par certaines classes autorisées
 * non-sealed: la sous-classe peut être librement étendue
 */
public class SealedFeature {

    // la classe Person ne peut être herité que par les classes Man, Woman et Child.
    sealed class Person permits Man, Woman, Child {
        public void die(){ System.out.println("super class"); }
    }

    non-sealed class Man extends Person {
        @Override
        public void die() {
            System.out.println("sous-classe");
        }
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
