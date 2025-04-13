package sv.edu.udb.service.mapper.dto.Materia;

import sv.edu.udb.Alumno.Alumno;
import sv.edu.udb.service.mapper.dto.AlumnoDTO;

import java.util.List;

public interface AlumnoService {
    List<AlumnoDTO> findAll();
    AlumnoDTO findById(Long  Id);
    AlumnoDTO save(AlumnoDTO alumnoDTO);
    AlumnoDTO update(Long id, AlumnoDTO alumnoDTO);
    void delete(Long id);
    List<AlumnoDTO> findbyMateriaId(Long materiaId);
}
