import React from 'react'
import { IconButton } from '@mui/material';
import StarBorderOutlinedIcon from '@mui/icons-material/StarBorderOutlined';
import LabelImportantOutlinedIcon from '@mui/icons-material/LabelImportantOutlined';
import { Checkbox} from "@mui/material";
import './Emailrow.css'

function Emailrow({id, title, subject, description,time}) {
    return (
        <div className='emailRow'>
            <div className='emailRow_options'>
                <Checkbox/> 
                <IconButton>
                    <StarBorderOutlinedIcon />
                </IconButton>
                <IconButton>
                    <LabelImportantOutlinedIcon />
                </IconButton>
            </div>
            <h3 className='emailRow_title'>
                {title}
            </h3>
            <div className='emailRow_message'>
                <h4>{subject}
                    <span className='emailRow_description'>{description}</span>
                </h4>
                
            </div>
            <div className='emailRow_description'>
                {time}
            </div>
        </div>
    )
}

export default Emailrow;