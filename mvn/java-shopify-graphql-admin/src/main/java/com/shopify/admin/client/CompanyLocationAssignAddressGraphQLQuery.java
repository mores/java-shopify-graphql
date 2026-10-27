package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CompanyAddressInput;
import com.shopify.admin.types.CompanyAddressType;
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
 * Updates an address on a company location.
 */
public class CompanyLocationAssignAddressGraphQLQuery extends GraphQLQuery {
  public CompanyLocationAssignAddressGraphQLQuery(String locationId, CompanyAddressInput address,
      List<CompanyAddressType> addressTypes, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }if (address != null || fieldsSet.contains("address")) {
        getInput().put("address", address);
    }if (addressTypes != null || fieldsSet.contains("addressTypes")) {
        getInput().put("addressTypes", addressTypes);
    }
  }

  public CompanyLocationAssignAddressGraphQLQuery(String locationId, CompanyAddressInput address,
      List<CompanyAddressType> addressTypes, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (locationId != null || fieldsSet.contains("locationId")) {
        getInput().put("locationId", locationId);
    }if (address != null || fieldsSet.contains("address")) {
        getInput().put("address", address);
    }if (addressTypes != null || fieldsSet.contains("addressTypes")) {
        getInput().put("addressTypes", addressTypes);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CompanyLocationAssignAddressGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyLocationAssignAddress";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String locationId;

    private CompanyAddressInput address;

    private List<CompanyAddressType> addressTypes;

    private String queryName;

    public CompanyLocationAssignAddressGraphQLQuery build() {
      return new CompanyLocationAssignAddressGraphQLQuery(locationId, address, addressTypes, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the company location to update addresses on.
     */
    public Builder locationId(String locationId) {
      this.locationId = locationId;
      this.fieldsSet.add("locationId");
      return this;
    }

    /**
     * The ID of the company location to update addresses on.
     */
    public Builder locationIdReference(String variableRef) {
      this.variableReferences.put("locationId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("locationId");
      return this;
    }

    /**
     * The input fields to use to update the address.
     */
    public Builder address(CompanyAddressInput address) {
      this.address = address;
      this.fieldsSet.add("address");
      return this;
    }

    /**
     * The input fields to use to update the address.
     */
    public Builder addressReference(String variableRef) {
      this.variableReferences.put("address", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("CompanyAddressInput"))).build());
      this.fieldsSet.add("address");
      return this;
    }

    /**
     * The list of address types on the location to update.
     */
    public Builder addressTypes(List<CompanyAddressType> addressTypes) {
      this.addressTypes = addressTypes;
      this.fieldsSet.add("addressTypes");
      return this;
    }

    /**
     * The list of address types on the location to update.
     */
    public Builder addressTypesReference(String variableRef) {
      this.variableReferences.put("addressTypes", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("CompanyAddressType"))))).build());
      this.fieldsSet.add("addressTypes");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
