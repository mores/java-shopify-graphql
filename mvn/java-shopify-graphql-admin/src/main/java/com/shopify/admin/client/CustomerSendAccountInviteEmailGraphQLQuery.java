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
 * Sends an email invitation for a customer to create a legacy customer account.
 * The invitation lets customers set up their password and activate their account
 * in the online store.
 *   
 * You can optionally customize the email content including the subject, sender,
 * recipients, and message body. If you don't provide email customization, the
 * store uses its default account invitation template.
 *   
 * > Note: The invite only works when legacy customer accounts are enabled on the shop.
 */
public class CustomerSendAccountInviteEmailGraphQLQuery extends GraphQLQuery {
  public CustomerSendAccountInviteEmailGraphQLQuery(String customerId, EmailInput email,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }
  }

  public CustomerSendAccountInviteEmailGraphQLQuery(String customerId, EmailInput email,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
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

  public CustomerSendAccountInviteEmailGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerSendAccountInviteEmail";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String customerId;

    private EmailInput email;

    private String queryName;

    public CustomerSendAccountInviteEmailGraphQLQuery build() {
      return new CustomerSendAccountInviteEmailGraphQLQuery(customerId, email, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the customer to whom an account invite email is to be sent.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    /**
     * The ID of the customer to whom an account invite email is to be sent.
     */
    public Builder customerIdReference(String variableRef) {
      this.variableReferences.put("customerId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("customerId");
      return this;
    }

    /**
     * Specifies the account invite email fields.
     */
    public Builder email(EmailInput email) {
      this.email = email;
      this.fieldsSet.add("email");
      return this;
    }

    /**
     * Specifies the account invite email fields.
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
