/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lms.LMSLibriWeb.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Egzon
 */
@Entity
@Table(name = "Course")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Course.findAll", query = "SELECT c FROM Course c"),
    @NamedQuery(name = "Course.findById", query = "SELECT c FROM Course c WHERE c.id = :id"),
    @NamedQuery(name = "Course.findByCourseTitle", query = "SELECT c FROM Course c WHERE c.courseTitle = :courseTitle"),
    @NamedQuery(name = "Course.findByCoursePIN", query = "SELECT c FROM Course c WHERE c.coursePIN = :coursePIN"),
    @NamedQuery(name = "Course.findByCourseDescription", query = "SELECT c FROM Course c WHERE c.courseDescription = :courseDescription")})
public class Course  {
    private static final long serialVersionUID = 1L;
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    //@NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "course_title")
    private String courseTitle;
    @Size(max = 50)
    @Column(name = "course_PIN")
    private String coursePIN;
    @Size(max = 200)
    @Column(name = "course_description")
    private String courseDescription;
//    @OneToMany(mappedBy = "courseId")
//    private List<Files> filesList;
//    @OneToMany(mappedBy = "courseId")
//    private List<Folder> folderList;

    public Course() {
    }

    public Course(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCoursePIN() {
        return coursePIN;
    }

    public void setCoursePIN(String coursePIN) {
        this.coursePIN = coursePIN;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

//    @XmlTransient
//    public List<Files> getFilesList() {
//        return filesList;
//    }
//
//    public void setFilesList(List<Files> filesList) {
//        this.filesList = filesList;
//    }
//
//    @XmlTransient
//    public List<Folder> getFolderList() {
//        return folderList;
//    }
//
//    public void setFolderList(List<Folder> folderList) {
//        this.folderList = folderList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Course)) {
            return false;
        }
        Course other = (Course) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lms.LMSLibriWeb.model.Course[ id=" + id + " ]";
    }
    
}
