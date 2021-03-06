/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package com.archimatetool.model;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.archimatetool.model.IArchimatePackage#getArchimateElement()
 * @model abstract="true"
 * @generated
 */
public interface IArchimateElement extends IArchimateComponent {

    /**
     * @return A list of diagram objects that reference this Archimate element
     */
    EList<IDiagramModelArchimateObject> getReferencingDiagramObjects();
    
} // IArchimateElement
