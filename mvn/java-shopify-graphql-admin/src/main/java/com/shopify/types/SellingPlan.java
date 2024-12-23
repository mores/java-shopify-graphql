package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents how a product can be sold and purchased. Selling plans and associated records (selling plan groups
 * and policies) are deleted 48 hours after a merchant uninstalls their subscriptions app. We recommend backing
 * up these records if you need to restore them later.
 *
 * For more information on selling plans, refer to
 * [*Creating and managing selling plans*](https://shopify.dev/docs/apps/selling-strategies/subscriptions/selling-plans).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SellingPlan implements com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.HasPublishedTranslations, com.shopify.types.Node {
  /**
   * A selling plan policy which describes the recurring billing details.
   */
  private SellingPlanBillingPolicy billingPolicy;

  /**
   * The category used to classify the selling plan for reporting purposes.
   */
  private SellingPlanCategory category;

  /**
   * The date and time when the selling plan was created.
   */
  private OffsetDateTime createdAt;

  /**
   * A selling plan policy which describes the delivery details.
   */
  private SellingPlanDeliveryPolicy deliveryPolicy;

  /**
   * Buyer facing string which describes the selling plan commitment.
   */
  private String description;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * When to reserve inventory for a selling plan.
   */
  private SellingPlanInventoryPolicy inventoryPolicy;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * List of metafield definitions.
   */
  private MetafieldDefinitionConnection metafieldDefinitions;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  /**
   * A customer-facing description of the selling plan.
   *   
   * If your store supports multiple currencies, then don't include
   * country-specific pricing content, such as "Buy monthly, get 10$ CAD off". This
   * field won't be converted to reflect different currencies.
   */
  private String name;

  /**
   * The values of all options available on the selling plan. Selling plans are
   * grouped together in Liquid when they're created by the same app, and have the
   * same `selling_plan_group.name` and `selling_plan_group.options` values.
   */
  private List<String> options;

  /**
   * Relative position of the selling plan for display. A lower position will be displayed before a higher position.
   */
  private Integer position;

  /**
   * Selling plan pricing details.
   */
  private List<SellingPlanPricingPolicy> pricingPolicies;

  /**
   * Returns a private metafield by namespace and key that belongs to the resource.
   */
  private PrivateMetafield privateMetafield;

  /**
   * List of private metafields that belong to the resource.
   */
  private PrivateMetafieldConnection privateMetafields;

  /**
   * The published translations associated with the resource.
   */
  private List<Translation> translations;

  public SellingPlan() {
  }

  /**
   * A selling plan policy which describes the recurring billing details.
   */
  public SellingPlanBillingPolicy getBillingPolicy() {
    return billingPolicy;
  }

  public void setBillingPolicy(SellingPlanBillingPolicy billingPolicy) {
    this.billingPolicy = billingPolicy;
  }

  /**
   * The category used to classify the selling plan for reporting purposes.
   */
  public SellingPlanCategory getCategory() {
    return category;
  }

  public void setCategory(SellingPlanCategory category) {
    this.category = category;
  }

  /**
   * The date and time when the selling plan was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * A selling plan policy which describes the delivery details.
   */
  public SellingPlanDeliveryPolicy getDeliveryPolicy() {
    return deliveryPolicy;
  }

  public void setDeliveryPolicy(SellingPlanDeliveryPolicy deliveryPolicy) {
    this.deliveryPolicy = deliveryPolicy;
  }

  /**
   * Buyer facing string which describes the selling plan commitment.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * When to reserve inventory for a selling plan.
   */
  public SellingPlanInventoryPolicy getInventoryPolicy() {
    return inventoryPolicy;
  }

  public void setInventoryPolicy(SellingPlanInventoryPolicy inventoryPolicy) {
    this.inventoryPolicy = inventoryPolicy;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * List of metafield definitions.
   */
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  /**
   * A customer-facing description of the selling plan.
   *   
   * If your store supports multiple currencies, then don't include
   * country-specific pricing content, such as "Buy monthly, get 10$ CAD off". This
   * field won't be converted to reflect different currencies.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The values of all options available on the selling plan. Selling plans are
   * grouped together in Liquid when they're created by the same app, and have the
   * same `selling_plan_group.name` and `selling_plan_group.options` values.
   */
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }

  /**
   * Relative position of the selling plan for display. A lower position will be displayed before a higher position.
   */
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  /**
   * Selling plan pricing details.
   */
  public List<SellingPlanPricingPolicy> getPricingPolicies() {
    return pricingPolicies;
  }

  public void setPricingPolicies(List<SellingPlanPricingPolicy> pricingPolicies) {
    this.pricingPolicies = pricingPolicies;
  }

  /**
   * Returns a private metafield by namespace and key that belongs to the resource.
   */
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  /**
   * List of private metafields that belong to the resource.
   */
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  /**
   * The published translations associated with the resource.
   */
  public List<Translation> getTranslations() {
    return translations;
  }

  public void setTranslations(List<Translation> translations) {
    this.translations = translations;
  }

  @Override
  public String toString() {
    return "SellingPlan{billingPolicy='" + billingPolicy + "', category='" + category + "', createdAt='" + createdAt + "', deliveryPolicy='" + deliveryPolicy + "', description='" + description + "', id='" + id + "', inventoryPolicy='" + inventoryPolicy + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', name='" + name + "', options='" + options + "', position='" + position + "', pricingPolicies='" + pricingPolicies + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', translations='" + translations + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlan that = (SellingPlan) o;
    return Objects.equals(billingPolicy, that.billingPolicy) &&
        Objects.equals(category, that.category) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(deliveryPolicy, that.deliveryPolicy) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(inventoryPolicy, that.inventoryPolicy) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(name, that.name) &&
        Objects.equals(options, that.options) &&
        Objects.equals(position, that.position) &&
        Objects.equals(pricingPolicies, that.pricingPolicies) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        Objects.equals(translations, that.translations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPolicy, category, createdAt, deliveryPolicy, description, id, inventoryPolicy, metafield, metafieldDefinitions, metafields, name, options, position, pricingPolicies, privateMetafield, privateMetafields, translations);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A selling plan policy which describes the recurring billing details.
     */
    private SellingPlanBillingPolicy billingPolicy;

    /**
     * The category used to classify the selling plan for reporting purposes.
     */
    private SellingPlanCategory category;

    /**
     * The date and time when the selling plan was created.
     */
    private OffsetDateTime createdAt;

    /**
     * A selling plan policy which describes the delivery details.
     */
    private SellingPlanDeliveryPolicy deliveryPolicy;

    /**
     * Buyer facing string which describes the selling plan commitment.
     */
    private String description;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * When to reserve inventory for a selling plan.
     */
    private SellingPlanInventoryPolicy inventoryPolicy;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * List of metafield definitions.
     */
    private MetafieldDefinitionConnection metafieldDefinitions;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    /**
     * A customer-facing description of the selling plan.
     *   
     * If your store supports multiple currencies, then don't include
     * country-specific pricing content, such as "Buy monthly, get 10$ CAD off". This
     * field won't be converted to reflect different currencies.
     */
    private String name;

    /**
     * The values of all options available on the selling plan. Selling plans are
     * grouped together in Liquid when they're created by the same app, and have the
     * same `selling_plan_group.name` and `selling_plan_group.options` values.
     */
    private List<String> options;

    /**
     * Relative position of the selling plan for display. A lower position will be displayed before a higher position.
     */
    private Integer position;

    /**
     * Selling plan pricing details.
     */
    private List<SellingPlanPricingPolicy> pricingPolicies;

    /**
     * Returns a private metafield by namespace and key that belongs to the resource.
     */
    private PrivateMetafield privateMetafield;

    /**
     * List of private metafields that belong to the resource.
     */
    private PrivateMetafieldConnection privateMetafields;

    /**
     * The published translations associated with the resource.
     */
    private List<Translation> translations;

    public SellingPlan build() {
      SellingPlan result = new SellingPlan();
      result.billingPolicy = this.billingPolicy;
      result.category = this.category;
      result.createdAt = this.createdAt;
      result.deliveryPolicy = this.deliveryPolicy;
      result.description = this.description;
      result.id = this.id;
      result.inventoryPolicy = this.inventoryPolicy;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.name = this.name;
      result.options = this.options;
      result.position = this.position;
      result.pricingPolicies = this.pricingPolicies;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      result.translations = this.translations;
      return result;
    }

    /**
     * A selling plan policy which describes the recurring billing details.
     */
    public Builder billingPolicy(SellingPlanBillingPolicy billingPolicy) {
      this.billingPolicy = billingPolicy;
      return this;
    }

    /**
     * The category used to classify the selling plan for reporting purposes.
     */
    public Builder category(SellingPlanCategory category) {
      this.category = category;
      return this;
    }

    /**
     * The date and time when the selling plan was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * A selling plan policy which describes the delivery details.
     */
    public Builder deliveryPolicy(SellingPlanDeliveryPolicy deliveryPolicy) {
      this.deliveryPolicy = deliveryPolicy;
      return this;
    }

    /**
     * Buyer facing string which describes the selling plan commitment.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * When to reserve inventory for a selling plan.
     */
    public Builder inventoryPolicy(SellingPlanInventoryPolicy inventoryPolicy) {
      this.inventoryPolicy = inventoryPolicy;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * List of metafield definitions.
     */
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * A customer-facing description of the selling plan.
     *   
     * If your store supports multiple currencies, then don't include
     * country-specific pricing content, such as "Buy monthly, get 10$ CAD off". This
     * field won't be converted to reflect different currencies.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The values of all options available on the selling plan. Selling plans are
     * grouped together in Liquid when they're created by the same app, and have the
     * same `selling_plan_group.name` and `selling_plan_group.options` values.
     */
    public Builder options(List<String> options) {
      this.options = options;
      return this;
    }

    /**
     * Relative position of the selling plan for display. A lower position will be displayed before a higher position.
     */
    public Builder position(Integer position) {
      this.position = position;
      return this;
    }

    /**
     * Selling plan pricing details.
     */
    public Builder pricingPolicies(List<SellingPlanPricingPolicy> pricingPolicies) {
      this.pricingPolicies = pricingPolicies;
      return this;
    }

    /**
     * Returns a private metafield by namespace and key that belongs to the resource.
     */
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    /**
     * List of private metafields that belong to the resource.
     */
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    /**
     * The published translations associated with the resource.
     */
    public Builder translations(List<Translation> translations) {
      this.translations = translations;
      return this;
    }
  }
}
