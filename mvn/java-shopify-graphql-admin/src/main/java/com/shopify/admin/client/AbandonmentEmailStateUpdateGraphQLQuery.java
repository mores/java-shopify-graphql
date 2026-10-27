package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.AbandonmentEmailState;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Updates the email state value for an abandonment.
 */
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

  public AbandonmentEmailStateUpdateGraphQLQuery(String id, AbandonmentEmailState emailState,
      OffsetDateTime emailSentAt, String emailStateChangeReason, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
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
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private AbandonmentEmailState emailState;

    private OffsetDateTime emailSentAt;

    private String emailStateChangeReason;

    private String queryName;

    public AbandonmentEmailStateUpdateGraphQLQuery build() {
      return new AbandonmentEmailStateUpdateGraphQLQuery(id, emailState, emailSentAt, emailStateChangeReason, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the abandonment that needs to be updated.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the abandonment that needs to be updated.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The new email state of the abandonment.
     */
    public Builder emailState(AbandonmentEmailState emailState) {
      this.emailState = emailState;
      this.fieldsSet.add("emailState");
      return this;
    }

    /**
     * The new email state of the abandonment.
     */
    public Builder emailStateReference(String variableRef) {
      this.variableReferences.put("emailState", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("AbandonmentEmailState"))).build());
      this.fieldsSet.add("emailState");
      return this;
    }

    /**
     * The date and time for when the email was sent, if that is the case.
     */
    public Builder emailSentAt(OffsetDateTime emailSentAt) {
      this.emailSentAt = emailSentAt;
      this.fieldsSet.add("emailSentAt");
      return this;
    }

    /**
     * The date and time for when the email was sent, if that is the case.
     */
    public Builder emailSentAtReference(String variableRef) {
      this.variableReferences.put("emailSentAt", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("DateTime")).build());
      this.fieldsSet.add("emailSentAt");
      return this;
    }

    /**
     * The reason why the email was or was not sent.
     */
    public Builder emailStateChangeReason(String emailStateChangeReason) {
      this.emailStateChangeReason = emailStateChangeReason;
      this.fieldsSet.add("emailStateChangeReason");
      return this;
    }

    /**
     * The reason why the email was or was not sent.
     */
    public Builder emailStateChangeReasonReference(String variableRef) {
      this.variableReferences.put("emailStateChangeReason", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("String")).build());
      this.fieldsSet.add("emailStateChangeReason");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
