package com.springboot.web.crud.journalentry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.web.crud.journalentry.model.JournalEntry;
import com.springboot.web.crud.journalentry.repository.JournalEntryRepository;

@Controller
public class JournalEntryController {

	@Autowired
	private JournalEntryRepository journalEntryRepository;
	
	@RequestMapping("/home")
	public String home() {
		return "home.jsp";
	}
	
	// ************* Basic Crud Operations *******************
	
	// Create and Update
	@RequestMapping("/addEntry")
	public String addUpdateJournalEntry(JournalEntry journalEntry) {
		
		// save or update journal entry in db
		journalEntryRepository.save(journalEntry);
		
		return "home.jsp";
		
	}
	
	// Get All Records
	@RequestMapping("/getAllEntries")
	public ModelAndView getAllJournalEntries() {
		ModelAndView mv = new ModelAndView();
		
		// Get All Entries list from db
		List<JournalEntry> entries = journalEntryRepository.findAll();
		
		mv.addObject("entries",entries);
		mv.setViewName("getAllEntries.jsp");
		
		return mv;
	}
	
	@RequestMapping("/getEntry")
	public ModelAndView getJournalEntry(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		
		// Get a specific entry using id from db
		JournalEntry journalEntry = journalEntryRepository.findById(id).orElse(new JournalEntry());
		
		mv.addObject("entry", journalEntry);
		mv.setViewName("getEntry.jsp");
		
		return mv;
	}
	
	@RequestMapping("/deleteEntry")
	public String deleteJournalEntry(@RequestParam int id) {
		
	
		// Delete a specific entry using id from db
		journalEntryRepository.deleteById(id);
		
		return "home.jsp";
	}
}
