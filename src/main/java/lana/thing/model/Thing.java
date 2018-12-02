package lana.thing.model;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lana.thing.model.deserializer.AttributeHandle;

import javax.persistence.*;

@Entity
@Table(name = "thing")
public class Thing {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn
    @JsonDeserialize(using = AttributeHandle.class)
    private Attribute mainAttribute;

    public Thing() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attribute getMainAttribute() {
        return mainAttribute;
    }

    public void setMainAttribute(Attribute mainAttribute) {
        this.mainAttribute = mainAttribute;
    }
}