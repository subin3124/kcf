package project.Customs.N.block;

import javax.persistence.*;

@Table(name = "N_block")
@Entity
public class NblockDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name_block")
    private String name;

    @Column
    private String image;

    @Column
    private int greenpara;

    @Column
    private String ingre;
    @Column(name = "ingre_amount")
    private int ingreamount;
    @Column(name = "N_partid")
    private long partid;
    @Column(name = "company_id")
    private long companyid;

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

    public int getGreenpara() {
        return greenpara;
    }

    public void setGreenpara(int greenpara) {
        this.greenpara = greenpara;
    }

    public String getIngre() {
        return ingre;
    }

    public void setIngre(String ingre) {
        this.ingre = ingre;
    }

    public int getIngreamount() {
        return ingreamount;
    }

    public void setIngreamount(int ingreamount) {
        this.ingreamount = ingreamount;
    }

    public long getPartid() {
        return partid;
    }

    public void setPartid(long partid) {
        this.partid = partid;
    }

    public long getCompanyid() {
        return companyid;
    }

    public void setCompanyid(long companyid) {
        this.companyid = companyid;
    }
}