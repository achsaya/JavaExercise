package com.demo;

interface Drawable{
        void draw();
    }
    class poly implements Drawable {
        public void draw()
        {
            System.out.println("drawing Rectangle");
        }
    }
    class Circle implements Drawable{
        public void draw() {
            System.out.println("drawing circle");
        }
    }
    class PolyDemo{
        public static void main(String[] args) {
            Drawable d=new Circle();
            d.draw();
            Drawable d1=new poly();
            d1.draw();
        }
    }
