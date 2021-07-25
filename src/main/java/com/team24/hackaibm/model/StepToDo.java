//package com.team24.hackaibm.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonInclude;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Entity
//@Table(name = "steptodo")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//@JsonInclude(JsonInclude.Include.NON_NULL)
//public class StepToDo implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//
//    private long sequence;
//    private String description;
//    private String image;
//
//    // Relationships
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "howtodo_id", nullable = false)
//    private HowToDo howToDo;
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public long getSequence() {
//        return sequence;
//    }
//
//    public void setSequence(long sequence) {
//        this.sequence = sequence;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//}
