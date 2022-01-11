package com.futurex.Caster.model.users;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Component
@JsonInclude(Include.NON_ABSENT)
public class User {
//    @Id
    public String uuid;
    public Long logId;
    public String firstName;
    public String lastName;
    //    @StoredAsJson
//    public Secretes secretes;
//    @StoredAsJson
//    public UserProperty userProperty;
//    @StoredAsJson
//    public SettingProperty settingProperty;
    //todo: make these optional<>
    public String createdAt;
    public String archivedAt;
    public String updatedAt;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getArchivedAt() {
        return archivedAt;
    }

    public void setArchivedAt(String archivedAt) {
        this.archivedAt = archivedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User() {
    }

    public User(String uuid,
                Long logId,
                String firstName,
                String lastName,
                String createdAt, String archivedAt, String updatedAt) {
        this.uuid = uuid;
        this.logId = logId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdAt = createdAt;
        this.archivedAt = archivedAt;
        this.updatedAt = updatedAt;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}