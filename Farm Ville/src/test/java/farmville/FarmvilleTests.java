package farmville;

import org.junit.Assert;
import org.junit.Test;

public class FarmvilleTests {
    @Test
    public void testMain(){
        System.out.println("Testting main");
    }


    @Test(expected = IllegalArgumentException.class)
    public void testAddAnimalShouldFailMaxCapacity() {
        Farm farm= new Farm("testFarm",0);
        Animal animal1 = new Animal("test", 10);
        farm.add(animal1);

    }

    @Test
    public void testAddAnimalShouldPass() {
        Farm farm= new Farm("testFarm",10);
        Animal animal1 = new Animal("test", 10);
        farm.add(animal1);
    }
    @Test
    public void testgetEnergy() {
        Farm farm= new Farm("testFarm",10);
        Animal animal1 = new Animal("test", 10);
        farm.add(animal1);
        Assert.assertEquals(10,animal1.getEnergy(),1.0);
    }


    @Test(expected = NullPointerException.class)
    public void testFarmInvalidNameNull() {
        Farm farm= new Farm(null,5);
        Animal animal1 = new Animal("test", 10);
    }

    @Test(expected = NullPointerException.class)
    public void testFarmInvalidNameWhiteSpace() {
        Farm farm= new Farm(" ",5);
        Animal animal1 = new Animal("test", 10);
    }

    @Test
    public void testFarmValidName() {
        Farm farm= new Farm("MyFarm",5);
        Animal animal1 = new Animal("test", 10);
        Assert.assertEquals(farm.getName(),"MyFarm");
    }


    @Test(expected = IllegalArgumentException.class)
    public void testFarmInvalidCapacity() {
        Farm farm= new Farm("testFarm",-5);
        Animal animal1 = new Animal("test", 10);
    }

    @Test
    public void testFarmGetCapacity() {
        Farm farm= new Farm("testFarm",2);
        Animal animal1 = new Animal("test", 10);
        Assert.assertEquals(farm.getCapacity(),2);
    }



    @Test
    public void testFarmGetName() {
        Farm farm= new Farm("testFarm",2);
        Animal animal1 = new Animal("test", 10);
        Assert.assertEquals(farm.getName(),"testFarm");
    }

    @Test
    public void testFarmGetAnimalSize() {
        Farm farm= new Farm("testFarm",2);
        Animal animal1 = new Animal("test", 10);
        farm.add(animal1);
        Assert.assertEquals(farm.getCount(),1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFarmGAnimalExists() {
        Farm farm= new Farm("testFarm",10);
        Animal animal1 = new Animal("test", 10);
        farm.add(animal1);
        farm.add(animal1);
    }



    @Test(expected = IllegalArgumentException.class)
    public void testFarmGFullCapacity() {
        Farm farm= new Farm("testFarm",1);
        Animal animal1 = new Animal("test", 10);
        Animal animal2= new Animal("test2",25);
        farm.add(animal1);
        farm.add(animal2);
    }

    @Test
    public void testFarmRemoveAnimalPass() {
        Farm farm= new Farm("testFarm",10);
        Animal animal1 = new Animal("test", 10);
        farm.add(animal1);
        farm.remove("test");
    }


    @Test
    public void testFarmRemoveAnimalFail() {
        Farm farm= new Farm("testFarm",10);
        Animal animal1 = new Animal("test", 10);
        farm.add(animal1);
        farm.remove("test2");
    }



}
