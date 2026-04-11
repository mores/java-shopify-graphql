package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.PageCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a [`Page`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Page) for the online store.
 *   
 * Pages contain custom content like "About Us" or "Contact" information that
 * merchants display outside their product catalog. The page requires a [`title`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Page#field-Page.fields.title)
 * and can include HTML content, publishing settings, and custom [template suffixes](https://shopify.dev/docs/api/admin-graphql/latest/objects/Page#field-Page.fields.templateSuffix).
 * You can control visibility through the [`isPublished`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Page#field-Page.fields.isPublished)
 * flag or schedule publication with a specific date.
 *   
 * The mutation returns the complete page object upon successful creation or validation errors if the input is invalid.
 */
public class PageCreateGraphQLQuery extends GraphQLQuery {
  public PageCreateGraphQLQuery(PageCreateInput page, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (page != null || fieldsSet.contains("page")) {
        getInput().put("page", page);
    }
  }

  public PageCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "pageCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private PageCreateInput page;

    private String queryName;

    public PageCreateGraphQLQuery build() {
      return new PageCreateGraphQLQuery(page, queryName, fieldsSet);
               
    }

    /**
     * The properties of the new page.
     */
    public Builder page(PageCreateInput page) {
      this.page = page;
      this.fieldsSet.add("page");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
