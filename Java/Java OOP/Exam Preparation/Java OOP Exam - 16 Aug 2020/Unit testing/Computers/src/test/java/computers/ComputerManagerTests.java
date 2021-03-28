package computers;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ComputerManagerTests {



    @Test
    public void testConstructor(){
        ComputerManager computerManager = new ComputerManager();

        Assert.assertEquals(0, computerManager.getCount());



    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddComputerWhenNullElementIsPassed() {
        ComputerManager computerManager = new ComputerManager();
        computerManager.addComputer(null);

    }

    @Test
    public void testAddComputer() {
        ComputerManager computerManager = new ComputerManager();
        computerManager.addComputer(new Computer("Pesho", "apple", 13.2));
        Assert.assertEquals(1, computerManager.getCount());
    }

    @Test
    public void testRemoveComputer() {

        Computer computer = new Computer("Pesho", "apple", 13.2);

        ComputerManager computerManager = new ComputerManager();
        computerManager.addComputer(computer);
        computerManager.removeComputer(computer.getManufacturer(), computer.getModel());

        Assert.assertEquals(0, computerManager.getCount());
    }


    @Test(expected = IllegalArgumentException.class)
    public void testGetComputerWhenElementDoesNotExists() {
        Computer computer = new Computer("Pesho", "apple", 13.2);
        Computer computer2 = new Computer("Pesho2", "apple2", 13.2);

        ComputerManager computerManager = new ComputerManager();
        computerManager.addComputer(computer);

        computerManager.getComputer("George", "Mackintosh");
    }


    @Test
    public void testGetComputerByManufacturer() {
        Computer computer = new Computer("Pesho", "apple", 13.2);
        Computer computer2 = new Computer("Pesho2", "apple2", 13.2);

        ComputerManager computerManager = new ComputerManager();
        computerManager.addComputer(computer);
        computerManager.addComputer(computer2);


        List<Computer> pesho = computerManager.getComputersByManufacturer("Pesho");
        Assert.assertEquals(1, pesho.size());
    }
}