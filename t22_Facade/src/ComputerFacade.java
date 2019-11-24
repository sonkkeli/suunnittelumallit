/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonja
 */
class ComputerFacade {
    private final CPU cpu;
    private final Memory ram;
    private final HardDrive hd;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        ram.load(1L, hd.read(100000, 1024000));
        cpu.jump(2L);
        cpu.execute();
    }
}
