package project.Customs.Sche;

import javax.persistence.*;

@Table(name = "Sche")
@Entity
public class ScheDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name_sche")
    private String name;

    @Column
    private String image;
    @Column
    private float width;
    @Column
    private float height;
    @Column
    private int greenpara;
    @Column(name = "greenpara_compare")
    private int greencompare;
    @Column
    private long company;
    @Column(name = "order_id")
    private long orderid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getGreenpara() {
        return greenpara;
    }

    public void setGreenpara(int greenpara) {
        this.greenpara = greenpara;
    }

    public int getGreencompare() {
        return greencompare;
    }

    public void setGreencompare(int greencompare) {
        this.greencompare = greencompare;
    }

    public long getCompany() {
        return company;
    }

    public void setCompany(long company) {
        this.company = company;
    }

    public long getOrderid() {
        return orderid;
    }

    public void setOrderid(long orderid) {
        this.orderid = orderid;
    }
}
