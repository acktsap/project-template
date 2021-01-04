/**
 * @copyright defined in LICENSE.txt
 */

package acktsap.sample.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(builderMethodName = "newBuilder")
public class RawItem {

  protected int value;

}
