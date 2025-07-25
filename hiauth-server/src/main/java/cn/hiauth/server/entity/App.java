package cn.hiauth.server.entity;

import cn.webestar.scms.commons.entity.BasicDO;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@TableName(value = "t_app", autoResultMap = true)
@Schema(name = "App", description = "应用")
public class App extends BasicDO<Long> {

    @TableField("cid")
    @Schema(description = "创建应用的企业CID")
    private Long cid;

    @TableField("name")
    @Schema(description = "名称")
    private String name;

    @TableField("icon")
    @Schema(description = "图标")
    private String icon;

    @TableField("home")
    @Schema(description = "图标")
    private String home;

    @TableField("create_time")
    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @TableField("creator")
    @Schema(description = "创建人")
    private Long creator;

    @TableField("remark")
    @Schema(description = "说明")
    private String remark;

    @Schema(description = "扩展字段")
    @TableField(value = "extend", typeHandler = JacksonTypeHandler.class)
    private Map<String, ?> extend;

}