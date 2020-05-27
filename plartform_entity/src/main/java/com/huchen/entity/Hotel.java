package com.huchen.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Hotel implements Serializable {
@TableId(type=IdType.AUTO)
  private Integer id;
  private String hotalName;
  private Integer hotalImage;
  private Integer type;
  private String hotalInfo;
  private String keyword;
  private Double lon;
  private Double lat;
  private Integer star;
  private String brand;
  private String address;
  private Date openTime;
  private Integer cid;
  private String regid;
  private BigDecimal price;
  private Integer roomNumber;

}
