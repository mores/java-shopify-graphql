package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.EmailInput;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Sends the company contact a welcome email.
 */
public class CompanyContactSendWelcomeEmailGraphQLQuery extends GraphQLQuery {
  public CompanyContactSendWelcomeEmailGraphQLQuery(String companyContactId, EmailInput email,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (companyContactId != null || fieldsSet.contains("companyContactId")) {
        getInput().put("companyContactId", companyContactId);
    }if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }
  }

  public CompanyContactSendWelcomeEmailGraphQLQuery(String companyContactId, EmailInput email,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (companyContactId != null || fieldsSet.contains("companyContactId")) {
        getInput().put("companyContactId", companyContactId);
    }if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CompanyContactSendWelcomeEmailGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyContactSendWelcomeEmail";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String companyContactId;

    private EmailInput email;

    private String queryName;

    public CompanyContactSendWelcomeEmailGraphQLQuery build() {
      return new CompanyContactSendWelcomeEmailGraphQLQuery(companyContactId, email, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the company contact to send welcome email to.
     */
    public Builder companyContactId(String companyContactId) {
      this.companyContactId = companyContactId;
      this.fieldsSet.add("companyContactId");
      return this;
    }

    /**
     * The ID of the company contact to send welcome email to.
     */
    public Builder companyContactIdReference(String variableRef) {
      this.variableReferences.put("companyContactId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("companyContactId");
      return this;
    }

    /**
     * The welcome email fields.
     */
    public Builder email(EmailInput email) {
      this.email = email;
      this.fieldsSet.add("email");
      return this;
    }

    /**
     * The welcome email fields.
     */
    public Builder emailReference(String variableRef) {
      this.variableReferences.put("email", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("EmailInput")).build());
      this.fieldsSet.add("email");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
