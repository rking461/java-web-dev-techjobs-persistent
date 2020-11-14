package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy="skills")
    private final List<Job> job = new ArrayList<>();

    @NotBlank(message = "Please add descripton")
    @Size(min = 1, max = 1000)

    public String description;

    public Skill(){
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}