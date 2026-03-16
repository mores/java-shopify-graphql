package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CompanyCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a [`Company`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Company)
 * for B2B commerce. This mutation creates the company and can optionally create an initial [`CompanyContact`](https://shopify.dev/docs/api/admin-graphql/latest/objects/CompanyContact) and [`CompanyLocation`](https://shopify.dev/docs/api/admin-graphql/latest/objects/CompanyLocation)
 * in a single operation. Company contacts are people who place orders on behalf
 * of the company. Company locations are branches or offices with their own
 * billing and shipping addresses.
 *   
 * > Note: Creating a company without a `name` [returns an error](https://shopify.dev/docs/api/admin-graphql/latest/mutations/companycreate?example=creating-a-company-without-a-name-returns-an-error).
 *   
 * Learn more about [creating companies for B2B](https://shopify.dev/docs/apps/build/b2b/start-building#step-1-create-a-company).
 */
public class CompanyCreateGraphQLQuery extends GraphQLQuery {
  public CompanyCreateGraphQLQuery(CompanyCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CompanyCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "companyCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CompanyCreateInput input;

    private String queryName;

    public CompanyCreateGraphQLQuery build() {
      return new CompanyCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The fields to use when creating the company.
     */
    public Builder input(CompanyCreateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
