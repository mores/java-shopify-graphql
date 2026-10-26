package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CustomerSetIdentifiers;
import com.shopify.admin.types.CustomerSetInput;
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
 * Creates or updates a customer in a single mutation.
 *   
 * Use this mutation when syncing information from an external data source into Shopify.
 *   
 * This mutation can be used to create a new customer, update an existing customer by id, or
 * upsert a customer by a unique key (email or phone).
 *   
 * To create a new customer omit the `identifier` argument.
 * To update an existing customer, include the `identifier` with the id of the customer to update.
 *   
 * To perform an 'upsert' by unique key (email or phone)
 * use the `identifier` argument to upsert a customer by a unique key (email or phone). If a customer
 * with the specified unique key exists, it will be updated. If not, a new customer will be created with
 * that unique key.
 *   
 * As of API version 2022-10, apps using protected customer data must meet the
 * protected customer data [requirements](https://shopify.dev/apps/store/data-protection/protected-customer-data)
 *   
 * Any list field (e.g.
 * [addresses](https://shopify.dev/api/admin-graphql/unstable/input-objects/MailingAddressInput),
 * will be updated so that all included entries are either created or updated, and all existing entries not
 * included will be deleted.
 *   
 * All other fields will be updated to the value passed. Omitted fields will not be updated.
 */
public class CustomerSetGraphQLQuery extends GraphQLQuery {
  public CustomerSetGraphQLQuery(CustomerSetInput input, CustomerSetIdentifiers identifier,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
    }
  }

  public CustomerSetGraphQLQuery(CustomerSetInput input, CustomerSetIdentifiers identifier,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CustomerSetGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerSet";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private CustomerSetInput input;

    private CustomerSetIdentifiers identifier;

    private String queryName;

    public CustomerSetGraphQLQuery build() {
      return new CustomerSetGraphQLQuery(input, identifier, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The properties of the customer.
     */
    public Builder input(CustomerSetInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The properties of the customer.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("CustomerSetInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * Specifies the identifier that will be used to lookup the resource.
     */
    public Builder identifier(CustomerSetIdentifiers identifier) {
      this.identifier = identifier;
      this.fieldsSet.add("identifier");
      return this;
    }

    /**
     * Specifies the identifier that will be used to lookup the resource.
     */
    public Builder identifierReference(String variableRef) {
      this.variableReferences.put("identifier", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("CustomerSetIdentifiers")).build());
      this.fieldsSet.add("identifier");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
