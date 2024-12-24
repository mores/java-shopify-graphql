package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.AbandonmentEmailState;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Set;


public class AbandonmentEmailStateUpdateGraphQLQuery extends GraphQLQuery {
  public AbandonmentEmailStateUpdateGraphQLQuery(String id, AbandonmentEmailState emailState,
      OffsetDateTime emailSentAt, String emailStateChangeReason, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (emailState != null || fieldsSet.contains("emailState")) {
        getInput().put("emailState", emailState);
    }if (emailSentAt != null || fieldsSet.contains("emailSentAt")) {
        getInput().put("emailSentAt", emailSentAt);
    }if (emailStateChangeReason != null || fieldsSet.contains("emailStateChangeReason")) {
        getInput().put("emailStateChangeReason", emailStateChangeReason);
    }
  }

  public AbandonmentEmailStateUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "abandonmentEmailStateUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private AbandonmentEmailState emailState;

    private OffsetDateTime emailSentAt;

    private String emailStateChangeReason;

    private String queryName;

    public AbandonmentEmailStateUpdateGraphQLQuery build() {
      return new AbandonmentEmailStateUpdateGraphQLQuery(id, emailState, emailSentAt, emailStateChangeReason, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder emailState(AbandonmentEmailState emailState) {
      this.emailState = emailState;
      this.fieldsSet.add("emailState");
      return this;
    }

    
    public Builder emailSentAt(OffsetDateTime emailSentAt) {
      this.emailSentAt = emailSentAt;
      this.fieldsSet.add("emailSentAt");
      return this;
    }

    
    public Builder emailStateChangeReason(String emailStateChangeReason) {
      this.emailStateChangeReason = emailStateChangeReason;
      this.fieldsSet.add("emailStateChangeReason");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
