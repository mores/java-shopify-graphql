package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves product resource feedback for the currently authenticated app,
 * providing insights into product data quality, completeness, and optimization
 * opportunities. This feedback helps apps guide merchants toward better product
 * listings and improved store performance.
 *   
 * For example, an SEO app might receive feedback indicating that certain
 * products lack meta descriptions or have suboptimal titles, enabling the app to
 * provide specific recommendations for improving search visibility and
 * conversion rates.
 *   
 * Use `ProductResourceFeedback` to:
 * - Display product optimization recommendations to merchants
 * - Identify data quality issues across product catalogs
 * - Build product improvement workflows and guided experiences
 * - Track progress on product listing completeness and quality
 * - Implement automated product auditing and scoring systems
 * - Generate reports on catalog health and optimization opportunities
 * - Provide contextual suggestions within product editing interfaces
 *   
 * The feedback system evaluates products against various criteria including SEO
 * best practices, required fields, media quality, and sales channel
 * requirements. Each feedback item includes specific details about the issue,
 * suggested improvements, and priority levels.
 *   
 * Feedback is app-specific and reflects the particular focus of your application
 * - marketing apps receive different insights than inventory management apps.
 * The system continuously updates as merchants make changes, providing real-time
 * guidance for product optimization.
 *   
 * This resource is particularly valuable for apps that help merchants improve
 * their product listings, optimize for search engines, or enhance their overall
 * catalog quality. The feedback enables proactive suggestions rather than
 * reactive problem-solving.
 *   
 * Learn more about [product optimization](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product).
 */
public class ProductResourceFeedbackGraphQLQuery extends GraphQLQuery {
  public ProductResourceFeedbackGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public ProductResourceFeedbackGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "productResourceFeedback";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public ProductResourceFeedbackGraphQLQuery build() {
      return new ProductResourceFeedbackGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The product associated with the resource feedback.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
