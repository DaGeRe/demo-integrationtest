package de.dagere.peass;

class ExampleClazz {
   public void verySimpleMethod() {
      System.out.println("Test");
   }

   public void integrationTestedMethod() {
      try {
         System.out.println("Calling integration test");
         Thread.sleep(1);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }
}