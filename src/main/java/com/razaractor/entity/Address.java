package com.razaractor.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author nakampe
 */
@Entity
@Data
public class Address implements Serializable {

    private static final long serialVersionUID = 5965586569262488611L;

    @Id
    private Long id;

}
