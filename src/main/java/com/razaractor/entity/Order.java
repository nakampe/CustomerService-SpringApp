package com.razaractor.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

/**
 *
 * @author nakampe
 */
@Entity
@Data
public class Order implements Serializable {

    private static final long serialVersionUID = -91978925351464504L;
    
    @Id
    private Long id;
    
}
