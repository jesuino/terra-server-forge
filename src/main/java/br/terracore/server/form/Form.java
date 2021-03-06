package br.terracore.server.form;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "\"form\"")
@XmlRootElement
public class Form implements Serializable {
        @Id
        @GeneratedValue
        private Integer id;
        
        private Date    date;
        
        private Double  coordx;
        
        private Double  coordy;
        
        private String  info1;
        
        private String  info2;
        
        private String  numberConfirmation;
        
        private String  variance;          // Desconformidade
                                            
        private String  otherNumbers;
        
        private String  primaryUse;
        
        private String  secondaryUse;
        
        private String  pavimentation;
        
        private String  asphaltGuide;
        
        private String  publicIlumination;
        
        private String  energy;
        
        private String  pluvialGallery;
        
        public Form() {
                // TODO Auto-generated constructor stub
        }
        
        public Form(
                    Integer id,
                    Date date,
                    Double coordx,
                    Double coordy,
                    String info1,
                    String info2,
                    String numberConfirmation,
                    String variance,
                    String otherNumbers,
                    String primaryUse,
                    String secondaryUse,
                    String pavimentation,
                    String asphaltGuide,
                    String publicIlumination,
                    String energy,
                    String pluvialGallery) {
                super();
                this.id = id;
                this.date = date;
                this.coordx = coordx;
                this.coordy = coordy;
                this.info1 = info1;
                this.info2 = info2;
                this.numberConfirmation = numberConfirmation;
                this.variance = variance;
                this.otherNumbers = otherNumbers;
                this.primaryUse = primaryUse;
                this.secondaryUse = secondaryUse;
                this.pavimentation = pavimentation;
                this.asphaltGuide = asphaltGuide;
                this.publicIlumination = publicIlumination;
                this.energy = energy;
                this.pluvialGallery = pluvialGallery;
        }
        
        public Integer getId() {
                return id;
        }
        
        public void setId(Integer id) {
                this.id = id;
        }
        
        public Date getDate() {
                return date;
        }
        
        public void setDate(Date date) {
                this.date = date;
        }
        
        public Double getCoordx() {
                return coordx;
        }
        
        public void setCoordx(Double coordx) {
                this.coordx = coordx;
        }
        
        public Double getCoordy() {
                return coordy;
        }
        
        public void setCoordy(Double coordy) {
                this.coordy = coordy;
        }
        
        public String getInfo1() {
                return info1;
        }
        
        public void setInfo1(String info1) {
                this.info1 = info1;
        }
        
        public String getInfo2() {
                return info2;
        }
        
        public void setInfo2(String info2) {
                this.info2 = info2;
        }
        
        public String getNumberConfirmation() {
                return numberConfirmation;
        }
        
        public void setNumberConfirmation(String numberConfirmation) {
                this.numberConfirmation = numberConfirmation;
        }
        
        public String getVariance() {
                return variance;
        }
        
        public void setVariance(String variance) {
                this.variance = variance;
        }
        
        public String getOtherNumbers() {
                return otherNumbers;
        }
        
        public void setOtherNumbers(String otherNumbers) {
                this.otherNumbers = otherNumbers;
        }
        
        public String getPrimaryUse() {
                return primaryUse;
        }
        
        public void setPrimaryUse(String primaryUse) {
                this.primaryUse = primaryUse;
        }
        
        public String getSecondaryUse() {
                return secondaryUse;
        }
        
        public void setSecondaryUse(String secondaryUse) {
                this.secondaryUse = secondaryUse;
        }
        
        public String getPavimentation() {
                return pavimentation;
        }
        
        public void setPavimentation(String pavimentation) {
                this.pavimentation = pavimentation;
        }
        
        public String getAsphaltGuide() {
                return asphaltGuide;
        }
        
        public void setAsphaltGuide(String asphaltGuide) {
                this.asphaltGuide = asphaltGuide;
        }
        
        public String getPublicIlumination() {
                return publicIlumination;
        }
        
        public void setPublicIlumination(String publicIlumination) {
                this.publicIlumination = publicIlumination;
        }
        
        public String getEnergy() {
                return energy;
        }
        
        public void setEnergy(String energy) {
                this.energy = energy;
        }
        
        public String getPluvialGallery() {
                return pluvialGallery;
        }
        
        public void setPluvialGallery(String pluvialGallery) {
                this.pluvialGallery = pluvialGallery;
        }
        
        @Override
        public String toString() {
                return "Form [id=" + id + ", date=" + date + ", coordx=" + coordx + ", coordy=" + coordy + ", info1=" + info1 + ", info2=" + info2 + ", numberConfirmation=" + numberConfirmation + ", variance=" + variance + ", otherNumbers=" + otherNumbers + ", primaryUse=" + primaryUse + ", secondaryUse=" + secondaryUse + ", pavimentation=" + pavimentation + ", asphaltGuide=" + asphaltGuide + ", publicIlumination=" + publicIlumination + ", energy=" + energy + ", pluvialGallery=" + pluvialGallery + "]";
        }
        
}