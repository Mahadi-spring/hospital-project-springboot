package com.example.hospitalproject.controller;

import com.example.hospitalproject.entity.Appointment;
import com.example.hospitalproject.entity.DoctorSignup;
import com.example.hospitalproject.service.DoctorSignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/doctor-signup/")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class DoctorSignupController {
    @Autowired
    DoctorSignupService doctorSignupService;

    @PostMapping("save-doctorinfo")
    public ResponseEntity<String> uploadFileWithObjectData(
            @RequestParam("image") MultipartFile file,
            @RequestBody DoctorSignup doctor) {
        String message = "";
        try {
            String uploadImage = service.uploadImageToFileSystem(file);
            message = "Uploaded the file successfully: " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
        } catch (Exception e) {
            message = "Could not upload the file: " + file.getOriginalFilename() + ". Error: " + e.getMessage();
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
        return ResponseEntity.ok("File uploaded successfully!");
    }

//    public void saveDoctorInfo(@RequestBody DoctorSignup doctorSignup){
//
//
//        doctorSignupService.saveDoctorInfo(doctorSignup);
//
//    }


    @GetMapping("specialized-doctorslist")
    List<DoctorSignup>ListOfSpecializedDoctors(@RequestParam(value = "dep") String  dep){


        return doctorSignupService.doctorsListByDep(dep);
    }

    @GetMapping("getdoctorsid/{id}")
    public DoctorSignup getById(@PathVariable("id") Long id, @RequestBody DoctorSignup doctorSignup){
        return doctorSignupService.findDoctorById(id);
    }

    @PutMapping("update-doctorinfo/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody DoctorSignup doctorSignup){
//        appointment.setId(id);
        doctorSignupService.update(id,doctorSignup );
    }
}
