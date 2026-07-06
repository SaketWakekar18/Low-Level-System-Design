public class ComputerFacade {
    private final CPU cpu = new CPU();
    private final Memory memory = new Memory();
    private final HardDisk hardDisk = new HardDisk();

    public void startComputer() {
        cpu.start();
        memory.load();
        hardDisk.read();
        System.out.println("Computer started");
    }
}
