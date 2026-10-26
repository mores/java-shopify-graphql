package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A treatment in a rollout. Each treatment receives a share of the rollout's
 * traffic and makes a set of changes to resources for the buyers it serves.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class RolloutTreatment implements com.shopify.admin.types.Node {
  /**
   * The changes this treatment makes to resources while it's served. Changes
   * retain their `id` and `__typename` if the affected resource is deleted or
   * inaccessible. Use `query` to filter by exact public `type`, `discount_id`,
   * `catalog_id`, `theme_id`, or `checkout_and_accounts_configuration_id` (numeric
   * ID or quoted GID). Theme IDs match the publish target; checkout and accounts
   * configuration IDs match either swap source or publish target. Each resource-ID
   * filter matches only readable, available resources.
   */
  private RolloutChangeConnection changes;

  /**
   * The ID of the rollout treatment.
   */
  private String id;

  /**
   * The rollout this treatment belongs to.
   */
  private Rollout rollout;

  /**
   * The percentage of the rollout's traffic, from 0 to 100, that this treatment is
   * configured to receive. The splits of a rollout's treatments add up to 100.
   */
  private int split;

  public RolloutTreatment() {
  }

  /**
   * The changes this treatment makes to resources while it's served. Changes
   * retain their `id` and `__typename` if the affected resource is deleted or
   * inaccessible. Use `query` to filter by exact public `type`, `discount_id`,
   * `catalog_id`, `theme_id`, or `checkout_and_accounts_configuration_id` (numeric
   * ID or quoted GID). Theme IDs match the publish target; checkout and accounts
   * configuration IDs match either swap source or publish target. Each resource-ID
   * filter matches only readable, available resources.
   */
  public RolloutChangeConnection getChanges() {
    return changes;
  }

  public void setChanges(RolloutChangeConnection changes) {
    this.changes = changes;
  }

  /**
   * The ID of the rollout treatment.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The rollout this treatment belongs to.
   */
  public Rollout getRollout() {
    return rollout;
  }

  public void setRollout(Rollout rollout) {
    this.rollout = rollout;
  }

  /**
   * The percentage of the rollout's traffic, from 0 to 100, that this treatment is
   * configured to receive. The splits of a rollout's treatments add up to 100.
   */
  public int getSplit() {
    return split;
  }

  public void setSplit(int split) {
    this.split = split;
  }

  @Override
  public String toString() {
    return "RolloutTreatment{changes='" + changes + "', id='" + id + "', rollout='" + rollout + "', split='" + split + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RolloutTreatment that = (RolloutTreatment) o;
    return Objects.equals(changes, that.changes) &&
        Objects.equals(id, that.id) &&
        Objects.equals(rollout, that.rollout) &&
        split == that.split;
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, id, rollout, split);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The changes this treatment makes to resources while it's served. Changes
     * retain their `id` and `__typename` if the affected resource is deleted or
     * inaccessible. Use `query` to filter by exact public `type`, `discount_id`,
     * `catalog_id`, `theme_id`, or `checkout_and_accounts_configuration_id` (numeric
     * ID or quoted GID). Theme IDs match the publish target; checkout and accounts
     * configuration IDs match either swap source or publish target. Each resource-ID
     * filter matches only readable, available resources.
     */
    private RolloutChangeConnection changes;

    /**
     * The ID of the rollout treatment.
     */
    private String id;

    /**
     * The rollout this treatment belongs to.
     */
    private Rollout rollout;

    /**
     * The percentage of the rollout's traffic, from 0 to 100, that this treatment is
     * configured to receive. The splits of a rollout's treatments add up to 100.
     */
    private int split;

    public RolloutTreatment build() {
      RolloutTreatment result = new RolloutTreatment();
      result.changes = this.changes;
      result.id = this.id;
      result.rollout = this.rollout;
      result.split = this.split;
      return result;
    }

    /**
     * The changes this treatment makes to resources while it's served. Changes
     * retain their `id` and `__typename` if the affected resource is deleted or
     * inaccessible. Use `query` to filter by exact public `type`, `discount_id`,
     * `catalog_id`, `theme_id`, or `checkout_and_accounts_configuration_id` (numeric
     * ID or quoted GID). Theme IDs match the publish target; checkout and accounts
     * configuration IDs match either swap source or publish target. Each resource-ID
     * filter matches only readable, available resources.
     */
    public Builder changes(RolloutChangeConnection changes) {
      this.changes = changes;
      return this;
    }

    /**
     * The ID of the rollout treatment.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The rollout this treatment belongs to.
     */
    public Builder rollout(Rollout rollout) {
      this.rollout = rollout;
      return this;
    }

    /**
     * The percentage of the rollout's traffic, from 0 to 100, that this treatment is
     * configured to receive. The splits of a rollout's treatments add up to 100.
     */
    public Builder split(int split) {
      this.split = split;
      return this;
    }
  }
}
