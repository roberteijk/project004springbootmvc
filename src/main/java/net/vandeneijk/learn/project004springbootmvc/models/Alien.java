/**
 * Created by Robert van den Eijk on 7-4-2020.
 */

package net.vandeneijk.learn.project004springbootmvc.models;

public class Alien {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " with ID of " + id;
    }
}