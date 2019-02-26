package Stream.Model;

import Stream.Abstract.AbstarctManusia;

public class Anggota extends AbstarctManusia {

    @Override
    public void speak() {
        System.out.println("hai");
    }

    public String getName () {
        return this.Name;
    }

    public void setName (String name) {
        this.Name = name;
    }
}
