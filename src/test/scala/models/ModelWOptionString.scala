package models

import io.swagger.annotations.{ ApiModel, ApiModelProperty }
import scala.annotation.meta.field

@ApiModel(description = "An Option[String] is a string not an array")
case class ModelWOptionString (
           @(ApiModelProperty @field)(value="this is an Option[String] attribute") stringOpt: Option[String],
           @(ApiModelProperty @field)(value="this is an Option[String] attribute with a dataType", dataType = "string")
             stringWithDataTypeOpt: Option[String]
                                   )


@ApiModel(description = "An Option[Model] is not an array")
case class ModelWOptionModel (
           @(ApiModelProperty @field)(value="this is an Option[Model] attribute") modelOpt: Option[ModelWOptionString]
                               )