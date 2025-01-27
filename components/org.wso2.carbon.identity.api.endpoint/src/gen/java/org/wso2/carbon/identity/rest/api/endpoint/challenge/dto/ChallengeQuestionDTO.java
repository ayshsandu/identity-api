package org.wso2.carbon.identity.rest.api.endpoint.challenge.dto;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class ChallengeQuestionDTO  {
  
  
  @NotNull
  private String locale = null;
  
  @NotNull
  private String question = null;
  
  @NotNull
  private String questionId = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("question")
  public String getQuestion() {
    return question;
  }
  public void setQuestion(String question) {
    this.question = question;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("questionId")
  public String getQuestionId() {
    return questionId;
  }
  public void setQuestionId(String questionId) {
    this.questionId = questionId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChallengeQuestionDTO {\n");
    
    sb.append("  locale: ").append(locale).append("\n");
    sb.append("  question: ").append(question).append("\n");
    sb.append("  questionId: ").append(questionId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
