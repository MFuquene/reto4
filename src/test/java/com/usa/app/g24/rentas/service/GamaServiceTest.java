package com.usa.app.g24.rentas.service;

import com.usa.app.g24.rentas.model.Gama;
import com.usa.app.g24.rentas.dto.GamaRequest;
import com.usa.app.g24.rentas.repository.GamaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class GamaServiceTest{
    @Mock
    private GamaRepository gamaRepository;

    /**
     * Gama Service
     */
    @InjectMocks
    private GamaService gamaService;

    @Test(expected = Exception.class)
    public void guardarCuandoNombreExiste() throws Exception {
        GamaRequest request = new GamaRequest();
        request.setName("Sedan");
        request.setDescription("Ultra lujo");

        Mockito.when(gamaRepository.findByName(request.getName()))
                .thenReturn(new Gama());

        gamaService.guardar(request);

    }

}
