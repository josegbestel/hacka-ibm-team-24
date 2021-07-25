//package com.team24.hackaibm.model;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.team24.hackaibm.model.enums.ProductCategory;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Entity
//@Table(name = "product")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//@JsonInclude(JsonInclude.Include.NON_NULL)
//public class Product implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//
//    private String title;
//    private String image;
//
//    // Relationships
//    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private HowToDo howToDo;
//
//    @Enumerated(EnumType.STRING)
//    private ProductCategory category;
//
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "categoria_id", nullable = false)
//    private Question question;
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    public HowToDo getHowToDo() {
//        return howToDo;
//    }
//
//    public void setHowToDo(HowToDo howToDo) {
//        this.howToDo = howToDo;
//    }
//}
