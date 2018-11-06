package com.company.project.model;

import javax.persistence.*;

@Table(name = "relation_lesson_credential")
public class RelationLessonCredential {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "lesson_id")
    private Integer lessonId;

    @Column(name = "credential_id")
    private Integer credentialId;

    @Column(name = "create_time")
    private String createTime;

    @Column(name = "update_time")
    private String updateTime;

    private Integer validation;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return lesson_id
     */
    public Integer getLessonId() {
        return lessonId;
    }

    /**
     * @param lessonId
     */
    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    /**
     * @return credential_id
     */
    public Integer getCredentialId() {
        return credentialId;
    }

    /**
     * @param credentialId
     */
    public void setCredentialId(Integer credentialId) {
        this.credentialId = credentialId;
    }

    /**
     * @return create_time
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return validation
     */
    public Integer getValidation() {
        return validation;
    }

    /**
     * @param validation
     */
    public void setValidation(Integer validation) {
        this.validation = validation;
    }
}