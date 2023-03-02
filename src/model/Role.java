package model;

import role.Roles;

public class Role extends BasicEntity{
    private Roles name;
    private User user;
    public Roles getName() {
        return name;
    }

    public void setName(Roles name) {
        this.name = name;
    }
}
