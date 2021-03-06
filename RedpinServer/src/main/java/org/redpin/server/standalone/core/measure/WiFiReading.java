/**
 * Filename: WiFiReading.java (in org.repin.server.standalone.core.measure) This
 * file is part of the Redpin project.
 *
 * Redpin is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or any later version.
 *
 * Redpin is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Redpin. If not, see <http://www.gnu.org/licenses/>.
 *
 * (c) Copyright ETH Zurich, Pascal Brogle, Philipp Bolliger, 2010, ALL RIGHTS
 * RESERVED.
 *
 * www.redpin.org
 */
package org.redpin.server.standalone.core.measure;

import org.redpin.server.standalone.db.IEntity;

/**
 * @see org.redpin.base.core.measure.WiFiReading
 * @author Pascal Brogle (broglep@student.ethz.ch)
 *
 */
public class WiFiReading extends org.redpin.base.core.measure.WiFiReading
        implements IEntity<Integer> {

    private Integer id;

    /**
     * @return the database id
     */
    @Override
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

}
