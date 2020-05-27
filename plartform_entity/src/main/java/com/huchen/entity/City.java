package com.huchen.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class City implements Serializable {

  @TableId(type = IdType.AUTO)
  private Integer id;
  private String cityName;
  private String cityPinyin;
  private Integer hotalNumber;
  private Date createTime;
  private Integer status;

}
