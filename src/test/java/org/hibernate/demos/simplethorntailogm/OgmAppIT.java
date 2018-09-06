package org.hibernate.demos.simplethorntailogm;

import static org.assertj.core.api.Assertions.assertThat;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.thorntail.test.ThorntailTestRunner;

/**
 * Integration test using Hibernate OGM application with Thorntail v4.
 *
 * This test requires a remote Infinispan server:
 * port and hostname can be specified in hotrodclient.properties
 */
@RunWith(ThorntailTestRunner.class)
public class OgmAppIT {

	@Inject
	private EmployeeRepo repo;

	@Test
	public void testJpa() {
		assertThat( repo ).isNotNull();
		repo.add( 1, "Fabio" );

		Employee employee = repo.load( 1 );
		assertThat( employee.getName() ).isEqualTo( "Fabio" );
	}

}
